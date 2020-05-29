import org.graalvm.polyglot.Context;

public class Example3 {
    public static void main(String[] args) {
        System.out.println("==== GraalVM example #03 ====");
        greet("Hello");
        try (Context context = Context.create()) {
            var greetings = "Hello from Java";
            context.getBindings("js").putMember("greetings", greetings);
            context.eval(
                    "js",
                    /* language=js */
                    "console.log('Javascript says: ' + greetings);");
        }
        System.out.println("=============================");
    }

    public static void greet(String greetings) {
        System.out.println("Java says: " + greetings);
    }
}
