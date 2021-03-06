package org.zerock.review.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.review.dto.Criteria;
import org.zerock.review.dto.ReviewDTO;

@Repository
public class ReviewDAO {

	@Inject
	private SqlSession sqlSession;
	
	// 게시판 리스트
	public List<ReviewDTO> list(Criteria cri) {
		System.out.println(getClass().getSimpleName()+".list()");
		System.out.println(cri);
		System.out.println(cri);
		System.out.println(cri);
		System.out.println(cri);
		System.out.println(cri);
		System.out.println(cri);
		System.out.println(cri);
		System.out.println(cri);
		return sqlSession.selectList
				("org.zerock.mapper.reviewmapper.list", cri);
	}

	// 게시판 글보기, 글 수정 폼 - 글번호가 필요하다. 파라메터로 전달 받는다.
	public ReviewDTO view(Integer rno) {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName()+".view()");
		System.out.println(rno);
		System.out.println(rno);
		System.out.println(rno);
		System.out.println(rno);
		System.out.println(rno);
		return sqlSession.selectOne
		("org.zerock.mapper.reviewmapper.view", rno);
	}
	
	// 게시판 글쓰기 
	public void insert(ReviewDTO ReviewDTO) {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName()+".insert()");
		sqlSession.insert
		("org.zerock.mapper.reviewmapper.insert", ReviewDTO);
	}
	
	// 게시판 글수정 처리
	public void update(ReviewDTO ReviewDTO) {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName()+".update()");
		System.out.println(ReviewDTO);
		System.out.println(ReviewDTO);
		System.out.println(ReviewDTO);
		System.out.println(ReviewDTO);
		sqlSession.update
		("org.zerock.mapper.reviewmapper.update", ReviewDTO);
	}
	
	// 게시판 글보기 1 증가 처리
	public void increase(Integer rno) {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName()+".increase()");
		sqlSession.update
		("org.zerock.mapper.reviewmapper.increase", rno);
	}
	
	// 게시판 글삭제 - 글번호를 받아서 처리
	public void delete(Integer rno) {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName()+".delete()");
		sqlSession.delete
		("org.zerock.mapper.reviewmapper.delete", rno);
	}

	// 게시판 전체 글의 갯수 구하는 메서드
	public Integer getTotalCount(Criteria cri) {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName()+".getTotalCount()");
		System.out.println(cri);
		System.out.println(cri);
		System.out.println(cri);
		System.out.println(cri);
		System.out.println(cri);
		System.out.println(cri);
		System.out.println(cri);
		System.out.println(cri);
		System.out.println(cri);
		return sqlSession.selectOne
		("org.zerock.mapper.reviewmapper.totalCount", cri);
	}
	
}
