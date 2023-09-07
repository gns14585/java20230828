package ch15collection.book.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();

        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        int size = list.size();
        System.out.println("총 객체 수 : " + size);
        System.out.println();

        // 인덱스 3번만 가져오기
        Board board = list.get(2);
        System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
        System.out.println();

        // 전체 객체 가져오기
        for (int i = 0; i < list.size(); i++) {
            Board b = list.get(i);
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
        System.out.println();

        // 인덱스 번호 2 객체 삭제, 2번이 연속적인 이유는 1,2,3,4,5 중 2번이 삭제시 3번이 2번으로 앞당겨짐
        list.remove(2);
        list.remove(2);

        // 삭제 후 남은 전체 객체 가져오기 (향상된 for문 사용)
        for (Board b : list) {
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
        System.out.println();

        // forEach 문 활용 (람다식)
        list.forEach(e -> {
            System.out.println(e.getSubject() + "\t" + e.getContent() + "\t" + e.getWriter());
        });
    }
}
