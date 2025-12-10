# Conflict Шийдвэрлэлт

## Conflict-ийн дэлгэрэнгүй

`feature/add-multiplication-doc` салбарыг `develop` руу нэгтгэхэд
`src/main/java/lab14/sict/must/edu/mn/Multiplication.java` файлын
`multiply` функцын Javadoc коммент дээр merge conflict гарсан.

## Шийдвэрлэлтийн алхмууд

1. Онцлогын салбар дээр дараах командыг ажиллуулсан:

   ```bash
   git checkout feature/add-multiplication-doc
   git merge develop
   ```

2. `Multiplication.java` файлыг нээгээд `<<<<<<<`, `=======`, `>>>>>>>`
   тэмдэглэгээнүүдийг олж, хоёр талын Javadoc комментийг нэгтгэсэн.

3. Засварласан файлаа stage-д оруулсан:

   ```bash
   git add src/main/java/lab14/sict/must/edu/mn/Multiplication.java
   ```

4. Merge commit үүсгэсэн:

   ```bash
   git commit -m "Multiplication Javadoc conflict-ийг шийдэв"
   ```

5. Салбарыг алсын репо руу push хийсэн:

   ```bash
   git push origin feature/add-multiplication-doc
   ```

6. GitHub дээр PR-ийг шинэчлэн, CI амжилттай болсны дараа `develop` руу merge хийсэн.
