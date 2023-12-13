-- 코드를 입력하세요
SELECT P1.ID, P1.NAME, P1.HOST_ID
FROM PLACES P1
INNER JOIN (SELECT HOST_ID, COUNT(HOST_ID) AS COUNTS
FROM PLACES GROUP BY HOST_ID)  AS P2
ON P1.HOST_ID = P2.HOST_ID
WHERE P2.COUNTS > 1;

