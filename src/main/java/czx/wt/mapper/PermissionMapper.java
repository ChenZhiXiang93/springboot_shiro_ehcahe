package czx.wt.mapper;

import czx.wt.entity.PermissionVO;
import czx.wt.pojo.Permission;

import java.util.List;

/**
 * @Description: 权限操作接口
 * @Author: ChenZhiXiang
 * @CreateDate: 2018/12/6 0006 16:45
 * @Version: 1.0
 */
public interface PermissionMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Permission permission);

    Permission selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(Permission record);

    /**
     * 查找所有权限数据
     * @return
     */
    List<Permission> findAll();

    /**
     * 查找所有子节点
     * @param pid
     * @return
     */
    List<Permission> findChildPerm(int pid);

    /**
     * 查询权限树列表
     * @return
     */
    List<PermissionVO> findPerms();

    /**
     * 根据角色id获取权限数据
	 * @param roleId
	 * @return
             */
    List<Permission> findPermsByRole(Integer roleId);

    /**
     * 根据用户id获取权限数据
     * @param userId
     * @return
     */
    List<PermissionVO> getUserPerms(Integer userId);
}
