public class Award {
    private int place;
    private String contest;

    public Award(int place,String contest){
        this.place = place;
        this.contest = contest;
    }
    @Override
    public String toString() {
        return "Award{ place = " + place +
        ", contest = " + contest + "}";
    }
    
}
