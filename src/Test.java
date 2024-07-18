public class Test {
    public static void main(String[] args) {
        // 크기가 100000인 int 배열 선언
        int[] numbers = new int[100000];

        // 1부터 100000까지 값 집어넣기
        for (int i = 0; i < 100000; i++) {
            numbers[i] = i + 1;
        }

        // 시작 시간 기록 (나노초 단위)
        long startTime = System.nanoTime();

        // 배열의 모든 값 더하기
        long sum = 0;
        for (int i = 0; i < 100000; i++) {
            sum += numbers[i];
        }

        // 종료 시간 기록 (나노초 단위)
        long endTime = System.nanoTime();

        // 결과 출력
        System.out.println("1부터 100000까지의 합: " + sum);
        System.out.println("실행 시간: " + (endTime - startTime) + " 나노초");
    }
}
