# File compression using Huffman codes

## Description

This project is a Java command line application which allows users to encode,
 decode and view information about files encoded with Huffman's algorithm.

## Project structure

### Entry point

Project's entry point is `Main` class. You can call this application from the
command line in three modes: `encode`, `decode` and `info`. After each of the
modes you have to provide a path to the `.txt` file you want to work with.

### io

This package contains all operations regarding input/output operations.

- **SingleInput**: reads one bit from the provided `InputStream`
- **LongInput**: reads specified amount of bits from the provided `InputStream`
, can also work as a `SingleInput`
- **FileInput**: is used to read Huffman's tree from the provided file.
- **SingleOutput**: writes one bit to the specified `OutputStream`
- **LongOutput**: writes multiple bits to the `OutputStream`, can also work as
`SingleOutput`
- **FileOutput**: writes Huffman's tree and encoded message to the specified
file

### tree

This package contains objects for constructing Huffman's tree.

- **Symbol**: a node in the Huffman's tree, Stores a symbol, number of its
occurrences in the encoded file or is an auxiliary node for storing other nodes
- **Occurrences**: counts occurrences of characters in the provided `String`
- **Ordered**: stores and orders characters by number of occurrences in 
ascending order
- **TreeBuilder**: builds a `Tree` using `Ordered` object
- **Tree**: represents Huffman's tree

### transformations

This package contains algorithms for encoding and decoding files using
Huffman's algorithm.

- **Encoded**: encodes a given `String` and provided codes created during
encoding
- **Decoded**: decodes a message from a file and provides reversed Huffman's
codes for used characters.

### modes

This package contains higher-level functionality represented as modes
in which this application can work.

- **EncodedMode**: encodes a message from a given file and writes it to another
file
- **DecodedMode**: decodes a message from an encoded file and writes it to
another file
- **InfoMode**: decodes a message, provides statictics about encoded and 
decoded files' sizes, degree of compression and the generated Huffman's tree

## Usage

This application can be used in three modes:

- **encode**: encode a file and write the encoded message to some other file
- **decode**: decode an encoded file
- **info**: get statistics about encoded file

Examples:

```bash
java Main encode input.txt
java Main decode input.txt.encoded.txt
java Main info input.txt.encoded.txt
```

Проект поддерживает следующие режимы:

- **`encode`** - кодирование файла.
- **`decode`** - декодированного сжатого файла.
- **`info`** - получение информации о сжатом файле.

Примеры запуска:

```bash
java Main encode Files/input.txt
java Main decode Files/input.ark
java Main info Files/input.ark
```
