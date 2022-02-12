package Mining;

import java.util.Vector;
import Mining.Log;

public class Event {
	private int _iD;
	private String _eventName;
	private int _caseID;
	private datetime _startTime;
	private datetime _endTime;
	public Vector<Log> _unnamed_Log_ = new Vector<Log>();

	public Event() {
		throw new UnsupportedOperationException();
	}

	public int getID() {
		return this._iD;
	}

	public void setID(int aID) {
		this._iD = aID;
	}

	public String getEventName() {
		return this._eventName;
	}

	public void setEventName(String aEventName) {
		this._eventName = aEventName;
	}

	public int getCaseID() {
		return this._caseID;
	}

	public void setCaseID(int aCaseID) {
		this._caseID = aCaseID;
	}

	public datetime getStartTime() {
		return this._startTime;
	}

	public void setStartTime(datetime aStartTime) {
		this._startTime = aStartTime;
	}

	public datetime getEndTime() {
		return this._endTime;
	}

	public void setEndTime(datetime aEndTime) {
		this._endTime = aEndTime;
	}
}