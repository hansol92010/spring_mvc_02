package kr.board.entity;

import lombok.Data;

@Data
public class Board {
	
	private int idx;		// 게시물 번호
	private String title;	// 게시물 제목
	private String content;	// 게시물 내용
	private String writer;	// 게시물 작성자
	private String indate;	// 게시물 작성일
	private int count;		// 게시물 조회수
	
	// setter 및  getter => Lombok API를 추가하면 자동으로 생성해준다
}
