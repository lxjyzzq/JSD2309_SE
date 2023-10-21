package generics;

public class TransferObject<T> {
    private  String  sender;    //发消息的人
    private  String  receiver;  //收消息的人
    private  T  data;      //消息内容


    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
