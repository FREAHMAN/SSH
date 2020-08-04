package cm.wf.vo;

import java.io.Serializable;
import java.util.Date;

public class news implements Serializable {
	private Integer nid;
	private String title;
	private Date pubdate;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "nid="+this.nid + "title="+this.title + "pubdate="+this.pubdate;
	}
	public Integer getNid() {
		return nid;
	}
	public void setNid(Integer nid) {
		this.nid = nid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getPubdate() {
		return pubdate;
	}
	public void setPubdate(Date pubdate) {
		this.pubdate = pubdate;
	}
	
	
	
	
}
