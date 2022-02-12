package WebService;

public class Webpage {
	public int _iD;
	private String _title;
	private String[] _tags;
	private String _content;

	public Webpage() {
		throw new UnsupportedOperationException();
	}

	public String getTitle() {
		return this._title;
	}

	public String[] getTags() {
		return this._tags;
	}

	public String getContent() {
		return this._content;
	}
}