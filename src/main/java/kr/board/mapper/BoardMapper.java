package kr.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import kr.board.entity.Board;

@Mapper
public interface BoardMapper {
	public List<Board> getLists();		// 게시물 전체 리스트
	public void boardInsert(Board vo);	// 게시물 등록
	public Board boardContent(int idx);	// 게시물 상세 조회
	public void boardDelete(int idx);	// 게시물 삭제
	public void boardUpdate(Board vo);	// 게시물 수정
	
	@Update("update myboard set count=count+1 where idx=#{idx}")
	public void boardCount(int idx);	// 조회수 증가
}
