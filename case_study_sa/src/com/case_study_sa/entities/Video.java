package com.case_study_sa.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Videos")
public class Video {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="Video_ID", unique=true)
	private int videoID;
	
	@Column(name="Video_Title")
	private String videoTitle;
	
//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name="Date_Created")
//	private Date dateVideoWasCreated;
	
	@Column(name="Date_Created")
	private String dateVideoWasCreated;
	
//	@Column(name="Video_Image_URL", columnDefinition="default 'https://i.stack.imgur.com/WFy1e.jpg'")
	@Column(name="Video_Image_URL")
	private String videoImageUrl;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Videos_And_Videolists", joinColumns=@JoinColumn(name="VideoID"), inverseJoinColumns =
			@JoinColumn(name = "VideolistID"))
	private List<Videolist> associatedVideolists = new ArrayList<>();
	
	
	@ManyToOne
	@JoinColumn(name="videolist_id")
	private Videolist associatedVideolistsSingle;

	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Video(String videoTitle, String videoImageUrl) {
		super();
		this.videoTitle = videoTitle;
		this.videoImageUrl = videoImageUrl;
	}

	public int getVideoID() {
		return videoID;
	}

	public void setVideoID(int videoID) {
		this.videoID = videoID;
	}

	public String getVideoTitle() {
		return videoTitle;
	}

	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
	}

	public String getDateVideoWasCreated() {
		return dateVideoWasCreated;
	}

	public void setDateVideoWasCreated(String dateVideoWasCreated) {
		this.dateVideoWasCreated = dateVideoWasCreated;
	}

	public String getVideoImageUrl() {
		return videoImageUrl;
	}

	public void setVideoImageUrl(String videoImageUrl) {
		this.videoImageUrl = videoImageUrl;
	}

	public List<Videolist> getAssociatedVideolists() {
		return associatedVideolists;
	}

	public void setAssociatedVideolists(List<Videolist> associatedVideolists) {
		this.associatedVideolists = associatedVideolists;
	}

	public Videolist getAssociatedVideolistsSingle() {
		return associatedVideolistsSingle;
	}

	public void setAssociatedVideolistsSingle(Videolist associatedVideolistsSingle) {
		this.associatedVideolistsSingle = associatedVideolistsSingle;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((associatedVideolists == null) ? 0 : associatedVideolists.hashCode());
		result = prime * result + ((dateVideoWasCreated == null) ? 0 : dateVideoWasCreated.hashCode());
		result = prime * result + videoID;
		result = prime * result + ((videoImageUrl == null) ? 0 : videoImageUrl.hashCode());
		result = prime * result + ((videoTitle == null) ? 0 : videoTitle.hashCode());
		return result;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Video other = (Video) obj;
//		if (associatedVideolists == null) {
//			if (other.associatedVideolists != null)
//				return false;
//		} else if (!associatedVideolists.equals(other.associatedVideolists))
//			return false;
//		if (dateVideoWasCreated == null) {
//			if (other.dateVideoWasCreated != null)
//				return false;
//		} else if (!dateVideoWasCreated.equals(other.dateVideoWasCreated))
//			return false;
//		if (videoID != other.videoID)
//			return false;
//		if (videoImageUrl == null) {
//			if (other.videoImageUrl != null)
//				return false;
//		} else if (!videoImageUrl.equals(other.videoImageUrl))
//			return false;
//		if (videoTitle == null) {
//			if (other.videoTitle != null)
//				return false;
//		} else if (!videoTitle.equals(other.videoTitle))
//			return false;
//		return true;
//	}
//
//	@Override
//	public String toString() {
//		return "Video [videoID=" + videoID + ", videoTitle=" + videoTitle + ", dateVideoWasCreated="
//				+ dateVideoWasCreated + ", videoImageUrl=" + videoImageUrl + ", associatedVideolists="
//				+ associatedVideolists + "]";
//	}
	
	

}
