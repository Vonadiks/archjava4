public class App {
    public static void main(String[] args) {
        Zags firsZags = new FirstZags(new MarriageRecord());
        CivilStatusRecord mRecord  = firsZags.createRecord();
        mRecord.printRecordType();

        Zags secondZags = new SecondZags(new BirthRecord());
        CivilStatusRecord bRecord  = secondZags.createRecord();
        bRecord.printRecordType();
    }

}
