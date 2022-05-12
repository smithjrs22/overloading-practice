public class TvShow {
    private String showName;
    private int numberOfEpisodes;
    private String tvGenre;

    public TvShow(String showName, int numberOfEpisodes, String tvGenre){
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.tvGenre = tvGenre;
    }
    public TvShow(String showName, int numberOfEpisodes){
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
    }
    public TvShow(String showName){
        this.showName = showName;
    }
    public TvShow(int numberOfEpisodes, String tvGenre){
        this.numberOfEpisodes = numberOfEpisodes;
        this.tvGenre = tvGenre;
    }
    public TvShow(String showName, String tvGenre){
        this.showName = showName;
        this.tvGenre = tvGenre;
    }
    public TvShow(int numberOfEpisodes){
        this.numberOfEpisodes = numberOfEpisodes;
    }
        
    public TvShow(String tvGenre){
        this.tvGenre = tvGenre;
    }

    public String getName(){
        return showName;
    }
    public int getNumberOfEpisodes(){
        return numberOfEpisodes;
    }
    public String getTvGenre(){
        return tvGenre;
    }

    public String toString(){
        return "The name of the show is " + getName() + " with " + getNumberOfEpisodes() + " number of episodes. The genre is " + getTvGenre();
    }

}