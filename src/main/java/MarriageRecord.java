public class MarriageRecord implements CivilStatusRecord {

    @Override
    public CivilStatusRecord createRecord() {
        System.out.println("Created civil status record of marriage.");
        return new MarriageRecord();
    }

    @Override
    public void printRecordType() {
        System.out.println("Marriage record");
    }
}
