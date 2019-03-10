CREATE TABLE HOTEL(
    ID NUMBER,
    CONSTRAINT ID_HOTEL PRIMARY KEY (ID),
    COUNTRY VARCHAR2(20) DEFAULT('N/A'),
    CONSTRAINT CHECK_COUNTRY CHECK (COUNTRY !='CHINA' OR
                                    COUNTRY != 'ROMANIA' OR
                                    COUNTRY !='BELGIUM' OR COUNTRY !='UKRAINE'),
    CITY VARCHAR2(20),
    STREET VARCHAR2(20)
    );