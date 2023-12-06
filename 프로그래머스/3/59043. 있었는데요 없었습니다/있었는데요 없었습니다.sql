-- 아이디, 이름 출력
-- 보호 시작일이 입양일보다 더 빠른
-- 보호 시작일이 빠른 순으로
SELECT I.ANIMAL_ID, I.NAME
FROM ANIMAL_INS AS I
LEFT JOIN ANIMAL_OUTS AS O
ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE I.DATETIME > O.DATETIME
ORDER BY I.DATETIME ASC;