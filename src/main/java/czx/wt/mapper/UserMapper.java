package czx.wt.mapper;

import czx.wt.entity.UserRoleDTO;
import czx.wt.entity.UserRolesVO;
import czx.wt.entity.UserSearchDTO;
import czx.wt.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 用户操作接口
 * @Author: ChenZhiXiang
 * @CreateDate: 2018/11/15 0015 11:21
 * @Version: 1.0
 */
public interface UserMapper {

    int deleteByPrimaryKey(@Param("id") Integer id);

    int insert(@Param("user") User user);

    User selectByPrimaryKey(@Param("id") Integer id);

    int updateByPrimaryKey(@Param("user") User user);

    /**
     * 分页查询用户数据
     * @return
     */
    List<UserRoleDTO> getUsers(@Param("userSearch") UserSearchDTO userSearch);

    /**
     * 删除用户
     * @param id
     * @param isDel
     * @return
     */
    int setDelUser(@Param("id") Integer id, @Param("isDel") Integer isDel,
                   @Param("insertUid") Integer insertUid);

    /**
     * 设置用户是否离职
     * @param id
     * @param isJob
     * @return
     */
    int setJobUser(@Param("id") Integer id, @Param("isJob") Integer isJob,
                   @Param("insertUid") Integer insertUid);

    /**
     * 查询用户及对应的角色
     * @param id
     * @return
     */
    UserRolesVO getUserAndRoles(Integer id);

    /**
     * 根据用户名和密码查找用户
     * @param username
     * @param password
     * @return
     */
    User findUser(@Param("username") String username,
                  @Param("password") String password);

    /**
     *	根据手机号获取用户数据
     * @param mobile
     * @return
     */
    User findUserByMobile(String mobile);

    /**
     * 根据用户名获取用户数据
     * @param username
     * @return
     */
    User findUserByName(String username);

    /**
     * 修改用户密码
     * @param id
     * @param password
     * @return
     */
    int updatePwd(@Param("id") Integer id, @Param("password") String password);

    /**
     * 是否锁定用户
     * @param id
     * @param isLock
     * @return
     */
    int setUserLockNum(@Param("id") Integer id, @Param("isLock") int isLock);
}
