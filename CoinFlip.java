public class CoinFlip {
    public CoinFlip() { }

    public String flip() {
        int flip = (int) (Math.random() * 2) + 1;
        if(flip == 1) {
            return "heads";
        } else {
            return "tails";
        }
    }

    public double Simulate(int flips) {
        int numHeads = 0;
        for (int i = 0; i < flips; i++) {
            String nFlip = flip();
            if(nFlip.equals("heads")) {
                numHeads++;
            }
        }
        double headsPer = (double) numHeads / flips;
        return headsPer;
    }
}