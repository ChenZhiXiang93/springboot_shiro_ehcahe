package czx.wt.response;

/**
 * @项目名称： wyait-manage
 * @类名称： ResponseResult
 * @类描述： 前端请求响应结果,code:编码,message:描述,obj对象，可以是单个数据对象，数据列表或者PageInfo
 * @创建时间： 2018年1月4日10:57:24
 * @version:
 */
public class ResponseResult {

    private String code;

    private String msg;

    private Object object;

    public ResponseResult() {
        this.code = IStatusMessage.SystemStatus.SUCCESS.getCode();
        this.message = IStatusMessage.SystemStatus.SUCCESS.getMessage();
    }

    public ResponseResult(IStatusMessage statusMessage){
        this.code = statusMessage.getCode();
        this.message = statusMessage.getMessage();

    }

}
