package hello;

import io.swagger.annotations.ApiModelProperty;

public class Greeting {

	private final long id;
	private final String content;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	@ApiModelProperty(required = true)
    public long getId() {
        return id;
    }
 
    @ApiModelProperty(notes = "The name of the user", required = true)
    public String getContent() {
        return content;
    }
}