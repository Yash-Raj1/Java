package String;

import java.lang.module.ModuleDescriptor.Builder;

public class String_Builder {
    public static void main(String[] args) {
    StringBuilder builder = new StringBuilder();
    for(int i=0;i<26;i++){
        builder.append((char)('a'+i));
    }
    System.out.println(builder.toString());    
    System.out.println(builder.delete(0,2));
}
}
