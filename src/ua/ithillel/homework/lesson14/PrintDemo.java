package ua.ithillel.homework.lesson14;

public class PrintDemo implements Printer {
    @Override
    public void print(Message message) {
        if (message.getSender() == null & message.getText() == null) {
            Printer EmptyMessage = new Printer() {
                @Override
                public void print(Message message) {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };
            if (message.getSender() == null) {
                System.out.println("Анонімний користувач відправив повідомлення: <текст повідомлення тут>");
            } else {
                System.out.println("Користувач <sender> відправив повідомлення: <текст повідомлення тут>");
            }

        }
    }
    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public String getSender() {
            return sender;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }
}