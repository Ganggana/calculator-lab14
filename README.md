# Maven-д суурилсан Java тооны машин (Lab14)

Энэ төсөл нь Maven-д суурилсан энгийн тооны машины жишээ бөгөөд Git workflow,
GitHub Actions CI, Checkstyle, JaCoCo 100% branch coverage ашигласан.

## Бүтээх ба ажиллуулах

### Тест ажиллуулах

```bash
mvn test
```

### Checkstyle шалгах

```bash
mvn checkstyle:check
```

### JaCoCo coverage тайлан гаргах

```bash
mvn jacoco:report
```

Тайлан: `target/site/jacoco/index.html` файлыг хөтөчөөр нээнэ.

### JaCoCo 100% branch coverage шалгах

```bash
mvn jacoco:check
```

## Файлын бүтэц

- `src/main/java/lab14/sict/must/edu/mn` – эх код
- `src/test/java/lab14/sict/must/edu/mn` – JUnit тестүүд
- `checkstyle.xml` – Checkstyle дүрэм
- `.github/workflows/ci.yml` – GitHub Actions CI workflow
