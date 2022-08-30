public class Games {

    public int cardNumber;
    public Cards card;




    public Games (int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void playGame () {
        if (card.getCreditBalance() > 15) {

            card.setCreditBalance(card.getCreditBalance());
        }
    }

}