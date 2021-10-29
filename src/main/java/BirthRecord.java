public class BirthRecord implements CivilStatusRecord{
    @Override
    public CivilStatusRecord createRecord() {
        System.out.println("Created civil status record of birth.");
        return new BirthRecord();
    }

    @Override
    public void printRecordType() {
        System.out.println("Birth record");
    }
}
