# Project_JSONtoCSV Project
## Sprint Deliverables

This repository includes the deliverables for the second stage of the project:

### Implementation in Java
- JSON parsing with a popular library (Jackson/Gson).
- CSV writing using OpenCSV.

### JSON Reader
- Opens JSON files.
- Parses contents into objects or lists.
- Handles exceptions such as missing files or formatting errors.
- Functions tested in isolation before integration.

### CSV Writer
- Creates and writes CSV files.
- Supports configurable delimiters and cell formats.
- Handles possible write errors.

### Documentation
- JavaDoc comments for each class and method.
- Purpose, parameters, and return values clearly explained.

### How to review and RUN

## How to Review and Run

Follow these steps to review and execute the repository content:

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd Project_JSONtoCSV

2. **Review the source code**

Navigate to src/main/java for implementation classes (JsonReader, CsvWriter, Dj).

Navigate to src/test/java for test classes (JsonReaderTest, CsvWriterTest).

Check JavaDoc comments for details on each method and class.


## Project structure

```
Project_JSONtoCSV
├─ pom.xml
├─ README.md
├─ file.csv
├─ src/
│  ├─ main/
│  │  ├─ java/
│  │  │  └─ 
│  │  │     ├─ CsvWriter
│  │  │     ├─ Dj
│  │  │     └─ JsonReader
│  ├─ test/
│  │  └─ java/
│  │     └─ 
│  │        ├─ JsonReaderTest.java
│  │        └─ CsvWriterTest.java
├  |─ target/
│  |  ├─ classes/
│  │  │     ├─ CsvWriter
│  │  │     ├─ Dj
│  │  │     ├─JsonReader
|  |  |     ├─JSON.json
│  ├─ generated-sources/
│  │        └─annotations
└─ .gitignore


