public interface Language {
    void getName(String name); //Interface wala thiyena methods aniwaren class eka athule override wenna oni
}
class ProgrammingLanguage implements Language{
    @Override
    public void getName(String name) {
        System.out.println("Programming Language:- " + name);
    }
}
class Test1{
    public static void main(String[] args) {
        Language l = new ProgrammingLanguage(); // ProgrammingLanguage pl = new ProgrammingLanguage();
        l.getName("Java");
    }
}