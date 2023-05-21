package com.javainuse.cadre.response;

import java.util.HashMap;
import java.util.List;

public class Response<T> {
	 private List<T> wrapperList;
	    private HashMap<String,String> errorMap;
	    private String errorMsg;
	    private String responseCode;
	    private String responseDesc;
	    private Long totalcount;
	    
	    
		public Response() {
			super();
			
		}
		public Response(List<T> wrapperList, HashMap<String, String> errorMap, String errorMsg, String responseCode,
				String responseDesc, Long totalcount) {
			super();
			this.wrapperList = wrapperList;
			this.errorMap = errorMap;
			this.errorMsg = errorMsg;
			this.responseCode = responseCode;
			this.responseDesc = responseDesc;
			this.totalcount = totalcount;
		}
		
		public List<T> getWrapperList() {
			return wrapperList;
		}
		public void setWrapperList(List<T> wrapperList) {
			this.wrapperList = wrapperList;
		}
		public HashMap<String, String> getErrorMap() {
			return errorMap;
		}
		public void setErrorMap(HashMap<String, String> errorMap) {
			this.errorMap = errorMap;
		}
		public String getErrorMsg() {
			return errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public String getResponseCode() {
			return responseCode;
		}
		public void setResponseCode(String responseCode) {
			this.responseCode = responseCode;
		}
		public String getResponseDesc() {
			return responseDesc;
		}
		public void setResponseDesc(String responseDesc) {
			this.responseDesc = responseDesc;
		}
		public Long getTotalcount() {
			return totalcount;
		}
		public void setTotalcount(Long totalcount) {
			this.totalcount = totalcount;
		}
		@Override
		public String toString() {
			return "Response [wrapperList=" + wrapperList + ", errorMap=" + errorMap + ", errorMsg=" + errorMsg
					+ ", responseCode=" + responseCode + ", responseDesc=" + responseDesc + ", totalcount=" + totalcount
					+ "]";
		}
		
		
}
