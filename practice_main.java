public class practice_main extends player {
    // public static void main(String[] args) {
    // node one = new node(10, 20);
    // node two = new node(55, 66);

    // node result = one.getCenter(two);
    // System.out.print(result.getX());
    // }
    // ----------------------------------------------------------------------------------------------------
    // 클래스 상속 practice
    // public static void main(String[] args) {
    // student std = new student("김시은", 25, 183, 76, "201700747", 3, 4.0);
    // std.show();

    // teacher tch1 = new teacher("균성이", 88, 120, 22, "ass2sd2", 12, 560);
    // tch1.show();
    // }

    // ----------------------------------------------------------------------------------------------------
    // 추상 클래스 practice
    public static void main(String[] args) {
        practice_main kkk = new practice_main();
        kkk.play("what the fuck");
    }

    @Override
    void play(String songName) {
        System.out.println(songName + " 곡을 재생합니다.");

    }

    @Override
    void pause() {
        System.out.println(" 일시정지.");

    }

    @Override
    void stop() {
        System.out.println(" 재생정지.");

    }
}