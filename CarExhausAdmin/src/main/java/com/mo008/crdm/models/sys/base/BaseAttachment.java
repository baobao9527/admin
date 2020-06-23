/*
 * Copyright © 2015-2016, AnHui Mobiao technology co. LTD Inc. All Rights Reserved.
 */

package com.mo008.crdm.models.sys.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAttachment<M extends BaseAttachment<M>> extends Model<M> implements IBean {

	public void setId(Long id) {
		set("id", id);
	}

	public Long getId() {
		return get("id");
	}

	public void setFileName(String fileName) {
		set("file_name", fileName);
	}

	public String getFileName() {
		return get("file_name");
	}

	public void setDateline(java.util.Date dateline) {
		set("dateline", dateline);
	}

	public java.util.Date getDateline() {
		return get("dateline");
	}

	public void setFileType(String fileType) {
		set("file_type", fileType);
	}

	public String getFileType() {
		return get("file_type");
	}

	public void setFileSize(Integer fileSize) {
		set("file_size", fileSize);
	}

	public Integer getFileSize() {
		return get("file_size");
	}

	public void setImage(Boolean image) {
		set("image", image);
	}

	public Boolean getImage() {
		return get("image");
	}

	public void setWidth(Integer width) {
		set("width", width);
	}

	public Integer getWidth() {
		return get("width");
	}

	public void setHeight(Integer height) {
		set("height", height);
	}

	public Integer getHeight() {
		return get("height");
	}

	public void setUserId(Integer userId) {
		set("user_id", userId);
	}

	public Integer getUserId() {
		return get("user_id");
	}

	public void setThumb(Boolean thumb) {
		set("thumb", thumb);
	}

	public Boolean getThumb() {
		return get("thumb");
	}

	public void setRemote(Boolean remote) {
		set("remote", remote);
	}

	public Boolean getRemote() {
		return get("remote");
	}

	public void setFolder(String folder) {
		set("folder", folder);
	}

	public String getFolder() {
		return get("folder");
	}

	public void setPath(String path) {
		set("path", path);
	}

	public String getPath() {
		return get("path");
	}

	public void setModeType(String modeType) {
		set("mode_type", modeType);
	}

	public String getModeType() {
		return get("mode_type");
	}

	public void setStatus(Boolean status) {
		set("status", status);
	}

	public Boolean getStatus() {
		return get("status");
	}

	public void setDownloads(Integer downloads) {
		set("downloads", downloads);
	}

	public Integer getDownloads() {
		return get("downloads");
	}

	public void setUrl(String url) {
		set("url", url);
	}

	public String getUrl() {
		return get("url");
	}

}