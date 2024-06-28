package javaexs;

public class DemoLambdas {

    public static void main(String[] args) {

        MessageImpl message = new MessageImpl();
        message.sendMessage();

        OnClickImpl onClickimpl = new OnClickImpl();
        onClickimpl.onClick(12);

        //life after lamdas
        IMessage iMessage = () -> {
            System.out.println("sending message from lamda");};
        iMessage.sendMessage();

        OnClickListener onClickListener = (v) -> {
            System.out.println("handling lamda click");
        };
        onClickListener.onClick(121);
    }
}
