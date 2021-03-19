package ca.uwaterloo.liang;

public enum MockLibrary {
    EASYMOCK ("org.easymock.EasyMock", "createMock"),
    MOCKITO ("org.mockito.Mockito", "mock"),
    POWERMOCK ("org.powermock.api.mockito.PowerMockito", "mock");
    
    private final String library;
    private final String method;
    
    MockLibrary(String library, String method) {
        this.library = library;
        this.method = method;
    }
    
    public String library() {
        return library;
    }
    public String method() {
        return method;
    }
    
}
