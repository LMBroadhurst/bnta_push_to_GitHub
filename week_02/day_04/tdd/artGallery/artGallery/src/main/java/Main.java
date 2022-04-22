public class Main {

    public static void main(String[] args) {

//        Customers

        Customer lewis = new Customer("Lewis", 1000);
        Customer falak = new Customer("Falak", 2000);

//        Testing customer behaviours

        lewis.checkWalletBalance();
        falak.checkWalletBalance();

        lewis.withdrawFromWallet(300);
        falak.depositToWallet(300);

        lewis.checkWalletBalance();
        falak.checkWalletBalance();


//        Galleries

        Gallery saatchi = new Gallery("Saatchi Gallery", 10000);
        Gallery tateModern = new Gallery("Tate Modern", 8000);

//        Testing gallery behaviours

        saatchi.checkCashReserve();
        tateModern.checkCashReserve();

        tateModern.depositToCashReserve(5000);
        tateModern.checkCashReserve();


//        Artworks

        Artwork napalm = new Artwork("Napalm", "Banksy", 5000, "Physical");
        Artwork monaLisa = new Artwork("Mona Lisa", "Leonardo da Vinci", 8000, "nft");

//        Adding artworks to gallery

        saatchi.addNewArtwork(monaLisa);
        System.out.println(saatchi.getArtworks().get(0).getTitle());

        for (int i = 0; i < saatchi.getArtworks().size(); i++) {
            System.out.println(saatchi.getArtworks().get(i).getTitle());
        }

        tateModern.addNewArtwork(napalm);


//        Artworks to add to artist

        Artist vincentVanGogh = new Artist("Vicent can Gogh", "VVG Portfolio", 100);

        Artwork sunflowers1 = new Artwork("Sunflowers 1", "Vincent van Gogh", 10000, "Physical");

        vincentVanGogh.AddArtToArtist(sunflowers1);

        System.out.println(vincentVanGogh.getPortfolio().get(0).getTitle());

        System.out.println(vincentVanGogh.getPortfolio().get(0).getPrice());

        System.out.println("-------------");


//        Sell artwork to gallery

        System.out.println(saatchi.getCashReserves());

        System.out.println(vincentVanGogh.getWallet());

        vincentVanGogh.sellToGallery(sunflowers1, saatchi);

        System.out.println(vincentVanGogh.getWallet());

        System.out.println(saatchi.getCashReserves());
    }



}
