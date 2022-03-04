package com.examples.postservice.model;

import javax.persistence.Id;

public class CommentsDto {
	
		
		int cid;
		
		int oid;
		
		String commenter;
		
		String comment;
		
		public CommentsDto() {
			
		}

		public int getCid() {
			return cid;
		}

		public void setCid(int cid) {
			this.cid = cid;
		}

		public int getOid() {
			return oid;
		}

		public void setOid(int oid) {
			this.oid = oid;
		}

		public String getCommenter() {
			return commenter;
		}

		public void setCommenter(String commenter) {
			this.commenter = commenter;
		}

		public String getComment() {
			return comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public CommentsDto(int cid, int oid, String commenter, String comment) {
			super();
			this.cid = cid;
			this.oid = oid;
			this.commenter = commenter;
			this.comment = comment;
		}
		

	}
