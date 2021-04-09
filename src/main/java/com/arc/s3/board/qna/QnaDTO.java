package com.arc.s3.board.qna;

import java.util.List;

import com.arc.s3.board.BoardDTO;
import com.arc.s3.board.BoardFileDTO;

public class QnaDTO extends BoardDTO{

	private List<BoardFileDTO> boardFiles;

	public List<BoardFileDTO> getBoardFiles() {
		return boardFiles;
	}

	public void setBoardFiles(List<BoardFileDTO> boardFiles) {
		this.boardFiles = boardFiles;
	}


	
	private long ref;
	private long step;
	private long depth;
	public long getRef() {
		return ref;
	}
	public void setRef(long ref) {
		this.ref = ref;
	}
	public long getStep() {
		return step;
	}
	public void setStep(long step) {
		this.step = step;
	}
	public long getDepth() {
		return depth;
	}
	public void setDepth(long depth) {
		this.depth = depth;
	}

	
	
	
}
