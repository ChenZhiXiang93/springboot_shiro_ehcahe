package czx.wt.mapper;

import czx.wt.pojo.RolePermissionKey;

import java.util.List;

/**
 * @Description: 类作用描述
 * @Author: ChenZhiXiang
 * @CreateDate: 2018/12/6 0006 16:58
 * @Version: 1.0
 */
public interface RolePermissionMapper {

    int deleteByPrimaryKey(RolePermissionKey rolePermissionKey);

    int insert(RolePermissionKey rolePermissionKey);

    List<RolePermissionKey> findByRole(int roleId);
}
