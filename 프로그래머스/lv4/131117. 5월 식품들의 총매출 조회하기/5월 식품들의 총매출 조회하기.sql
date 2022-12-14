-- 코드를 입력하세요
SELECT A.PRODUCT_ID, B.PRODUCT_NAME, SUM(A.AMOUNT*B.PRICE) AS TOTAL_SALES
FROM FOOD_ORDER A JOIN (SELECT * FROM FOOD_PRODUCT) B
USING(PRODUCT_ID)
WHERE MONTH(PRODUCE_DATE) = '05'
GROUP BY A.PRODUCT_ID
ORDER BY TOTAL_SALES DESC, B.PRODUCT_ID;