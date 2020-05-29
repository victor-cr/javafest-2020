console.log('==== GraalVM example #02 ====');
Polyglot.eval('java', 'System.out.println("Java says: Hello");');
const greetings = 'Hello too';
console.log('Javascript says: ' + greetings);
console.log('=============================');
