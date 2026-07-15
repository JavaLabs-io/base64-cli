# base64-cli

A small Java tool that encodes and decodes Base64 strings from your terminal.

---

## Getting Started

Compile:
```
javac Main.java
```

---

## Usage

### CLI Mode

Pass the command and input directly:

```
java -cp . Main encode "hello world"
java -cp . Main decode "aGVsbG8gd29ybGQ="
```

### Interactive Mode

Run without arguments and the tool will prompt you:

```
java -cp . Main
```

```
Base64 CLI — Interactive Mode
Choose action (encode/decode): encode
Enter text: hello world
Encoded: aGVsbG8gd29ybGQ=
```

---

## Example

```
$ java -cp . Main encode "hello world"
Encoded: aGVsbG8gd29ybGQ=

$ java -cp . Main decode "aGVsbG8gd29ybGQ="
Decoded: hello world
```
