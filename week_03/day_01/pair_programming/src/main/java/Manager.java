public class Manager extends FootballEmployee{

    private String styleOfPlay;
    private Boolean likedByFans;

    public Manager(String name, int age, int wage, String styleOfPlay, Boolean likedByFans) {
        super(name, age, wage);
        this.styleOfPlay = styleOfPlay;
        this.likedByFans = likedByFans;
    }

    public String getStyleOfPlay() {
        return styleOfPlay;
    }

    public void setStyleOfPlay(String styleOfPlay) {
        this.styleOfPlay = styleOfPlay;
    }

    public Boolean getLikedByFans() {
        return likedByFans;
    }

    public void setLikedByFans(Boolean likedByFans) {
        this.likedByFans = likedByFans;
    }
}
