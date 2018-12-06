package czx.wt.response;

/**
 * @Description: 类作用描述
 * @Author: ChenZhiXiang
 * @CreateDate: 2018/12/6 0006 20:43
 * @Version: 1.0
 */
public interface IStatusMessage {

    String code();

    String msg();

    public enum SystemStatus implements IStatusMessage{

        SUCCESS("1000","SUCCESS"), //请求成功
        ERROR("1001","ERROR"),	   //请求失败
        PARAM_ERROR("1002","PARAM_ERROR"), //请求参数有误
        SUCCESS_MATCH("1003","SUCCESS_MATCH"), //表示成功匹配
        NO_LOGIN("1100","NO_LOGIN"), //未登录
        MANY_LOGINS("1101","MANY_LOGINS"), //多用户在线（踢出用户）
        UPDATE("1102","UPDATE"), //用户信息或权限已更新（退出重新登录）
        LOCK("1111","LOCK"); //用户已锁定

        private String code;

        private String msg;



    }


}
