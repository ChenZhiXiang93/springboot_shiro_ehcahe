package czx.wt.mapper;

import czx.wt.pojo.UserRoleKey;

import java.util.List;

/**
 * @Description: 类作用描述
 * @Author: ChenZhiXiang
 * @CreateDate: 2018/12/6 0006 16:56
 * @Version: 1.0
 */
public interface UserRoleMapper {

    int deleteByPrimaryKey(UserRoleKey key);

    int insert(UserRoleKey record);

    /**
     * 根据用户获取用户角色中间表数据
     * @param userId
     * @return
     */
    List<UserRoleKey> findByUserId(int userId);
}
