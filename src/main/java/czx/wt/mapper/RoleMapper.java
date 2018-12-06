package czx.wt.mapper;

import czx.wt.entity.RoleVO;
import czx.wt.pojo.Role;

import java.util.List;

/**
 * @Description: 角色操作接口
 * @Author: ChenZhiXiang
 * @CreateDate: 2018/11/20 0020 14:48
 * @Version: 1.0
 */
public interface RoleMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Role role);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(Role role);

    /**
     * 分页查询所有的角色列表
     * @return
     */
    List<Role> findList();

    /**
     * 获取角色相关的数据
     * @param id
     * @return
     */
    RoleVO findRoleAndPerms(Integer id);

    /**
     * 根据用户id获取角色数据
     * @param userId
     * @return
     */
    List<Role> getRoleByUserId(Integer userId);

    /**
     * 获取所有角色
     * @return
     */
    List<Role> getRoles();
}
