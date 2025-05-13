package ru.safonov.convenient_software.test_task.services;

import org.apache.poi.ss.usermodel.*;
import org.springframework.stereotype.Service;
import ru.safonov.convenient_software.test_task.dto.FileRequest;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

@Service
public class FileService {
    public int findMinNumFromFile(FileRequest req) {

        Path normalizedPath = Paths.get(req.getPath());

        try (Workbook book = WorkbookFactory.create(normalizedPath.toFile())) {
            int n = req.getN();

            Sheet sheet = book.getSheetAt(0);
            List<Integer> nums = new ArrayList<>();

            for (Row row : sheet) {
                Cell cell = row.getCell(0, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);

                if (!isNull(cell) && cell.getCellType() == CellType.NUMERIC)
                    nums.add((int) cell.getNumericCellValue());
            }

            if (nums.isEmpty()) throw new IllegalArgumentException("Файл не содержит чисел!");

            if (n <= 0 || n > nums.size()) throw new IllegalArgumentException("Некорректный номер элемента N!");

            return getMinFromList(nums, 0, nums.size() - 1, n - 1);
        } catch (IOException e) {
            throw new RuntimeException("Ошибка чтения: " + e.getMessage(), e);
        }
    }

    public int getMinFromList(List<Integer> list, int left, int right, int n) {
        if (left == right) {
            return list.get(left);
        }

        int index = split(list, left, right);

        if (n == index) {
            return list.get(n);
        } else if (n < index) {
            return getMinFromList(list, left, index - 1, n);
        } else {
            return getMinFromList(list, index + 1, right, n);
        }
    }

    private int split(List<Integer> list, int left, int right) {
        int pivot = list.get(right);
        int i = left;

        for (int j = left; j < right; j++) {
            if (list.get(j) <= pivot) {
                swap(list, i, j);
                i++;
            }
        }

        swap(list, i, right);
        return i;
    }

    private void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}


