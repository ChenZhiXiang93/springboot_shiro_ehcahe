package czx.wt.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import czx.wt.entity.UserDTO;
import czx.wt.entity.UserRoleDTO;
import czx.wt.entity.UserRolesVO;
import czx.wt.entity.UserSearchDTO;
import czx.wt.mapper.RoleMapper;
import czx.wt.mapper.UserMapper;
import czx.wt.mapper.UserRoleMapper;
import czx.wt.pojo.Role;
import czx.wt.pojo.User;
import czx.wt.service.UserService;
import czx.wt.utils.PageDataResult;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author ChenZhiXiang
 * @version 1.0.0
 * @Description TODO
 * @createTime 2018年12月06日 22:37:00
 */
@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public PageDataResult getUsers(UserSearchDTO userSearch, int page, int limit) {
        // 时间处理
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (null != userSearch){
            if (StringUtils.isNotEmpty(userSearch.getInsertTimeStart())&&StringUtils.isEmpty(userSearch.getInsertTimeEnd())){
                userSearch.setInsertTimeEnd(df.format(new Date()));
            }else if (StringUtils.isEmpty(userSearch.getInsertTimeStart())&&StringUtils.isNotEmpty(userSearch.getInsertTimeEnd())){
                userSearch.setInsertTimeStart(df.format(new Date()));
            }
            if (StringUtils.isNotEmpty(userSearch.getInsertTimeStart()) && StringUtils.isNotEmpty(userSearch.getInsertTimeEnd())){
                if (userSearch.getInsertTimeEnd().compareTo(
                        userSearch.getInsertTimeStart()) < 0) {
                    String temp = userSearch.getInsertTimeStart();
                    userSearch
                            .setInsertTimeStart(userSearch.getInsertTimeEnd());
                    userSearch.setInsertTimeEnd(temp);
                }
            }
        }
        PageDataResult pageDataResult = new PageDataResult();
        PageHelper.startPage(page,limit);
        List<UserRoleDTO> urList = userMapper.getUsers(userSearch);
        // 获取分页查询后的数据
        PageInfo<UserRoleDTO> pageInfo = new PageInfo<>(urList);
        // 设置获取到的总记录数total：
        pageDataResult.setTotals(Long.valueOf(pageInfo.getTotal()).intValue());
        // 将角色名称提取到对应的字段中
        if (null != urList && urList.size() > 0){
            for (UserRoleDTO ur : urList){
                List<Role> roles = roleMapper.getRoleByUserId(ur.getId());
                if (null != null && roles.size() > 0){
                    StringBuilder sb = new StringBuilder();
                    for (int i =0;i < roles.size();i++){
                        Role role = roles.get(i);
                        sb.append(role.getRoleName());
                        if (i != (roles.size() - 1)) {
                            sb.append("，");
                        }
                    }
                    ur.setRoleNames(sb.toString());
                }
            }
        }
        pageDataResult.setList(urList);
        return pageDataResult;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 30000, rollbackFor = {
            RuntimeException.class, Exception.class })
    public String setUser(User user, String roleIds) {

        return null;
    }

    @Override
    public String setJobUser(Integer id, Integer isJob, Integer insertUid, Integer version) {
        return null;
    }

    @Override
    public String setDelUser(Integer id, Integer isDel, Integer insertUid, Integer version) {
        return null;
    }

    @Override
    public UserRolesVO getUserAndRoles(Integer id) {
        return null;
    }

    @Override
    public String sendMsg(UserDTO user) {
        return null;
    }

    @Override
    public User findUserByMobile(String mobile) {
        return null;
    }

    @Override
    public String sendMessage(int userId, String mobile) {
        return null;
    }

    @Override
    public int updatePwd(Integer id, String password) {
        return 0;
    }

    @Override
    public int setUserLockNum(Integer id, int isLock) {
        return 0;
    }
}
