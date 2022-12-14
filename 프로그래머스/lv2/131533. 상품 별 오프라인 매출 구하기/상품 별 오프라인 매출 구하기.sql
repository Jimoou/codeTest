-- 코드를 입력하세요
SELECT P.PRODUCT_CODE, SUM(P.PRICE*OS.SALES_AMOUNT) AS SALES
FROM PRODUCT P
JOIN(SELECT PRODUCT_ID, SALES_AMOUNT FROM OFFLINE_SALE) AS OS USING(PRODUCT_ID)
GROUP BY P.PRODUCT_ID
ORDER BY SALES DESC, P.PRODUCT_CODE;