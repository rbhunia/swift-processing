The Application Header (AppHdr) is part of the ISO 20022 standard and is included in messages when sent over a financial network such as SWIFT. Below is a complete pacs.008 XML message, including the Application Header (AppHdr).

pacs.008 XML with AppHdr

<?xml version="1.0" encoding="UTF-8"?>
<Envelope xmlns="urn:iso:std:iso:20022:tech:xsd:head.001.001.01">
    <!-- Application Header -->
    <AppHdr xmlns="urn:iso:std:iso:20022:tech:xsd:head.001.001.01">
        <Fr>
            <FIId>
                <FinInstnId>
                    <BICFI>INSTBICXXX</BICFI>
                </FinInstnId>
            </FIId>
        </Fr>
        <To>
            <FIId>
                <FinInstnId>
                    <BICFI>RECVBICXXX</BICFI>
                </FinInstnId>
            </FIId>
        </To>
        <BizMsgIdr>BMID1234567890</BizMsgIdr>
        <MsgDefIdr>pacs.008.001.09</MsgDefIdr>
        <BizSvc>SEPA</BizSvc>
        <CreDt>2024-12-09T12:30:00</CreDt>
        <CpyDplct>CODU</CpyDplct>
        <PssblDplct>true</PssblDplct>
    </AppHdr>

    <!-- Message Body -->
    <Document xmlns="urn:iso:std:iso:20022:tech:xsd:pacs.008.001.09">
        <FIToFICstmrCdtTrf>
            <GrpHdr>
                <MsgId>MSGID1234567890</MsgId>
                <CreDtTm>2024-12-09T12:30:00</CreDtTm>
                <NbOfTxs>1</NbOfTxs>
                <SttlmInf>
                    <SttlmMtd>CLRG</SttlmMtd>
                    <ClrSys>
                        <ClrSysId>TARGET2</ClrSysId>
                    </ClrSys>
                </SttlmInf>
                <InstgAgt>
                    <FinInstnId>
                        <BICFI>INSTBICXXX</BICFI>
                    </FinInstnId>
                </InstgAgt>
                <InstdAgt>
                    <FinInstnId>
                        <BICFI>RECVBICXXX</BICFI>
                    </FinInstnId>
                </InstdAgt>
            </GrpHdr>
            <CdtTrfTxInf>
                <PmtId>
                    <InstrId>INSTR1234567890</InstrId>
                    <EndToEndId>E2E1234567890</EndToEndId>
                    <TxId>TXID1234567890</TxId>
                </PmtId>
                <PmtTpInf>
                    <InstrPrty>NORM</InstrPrty>
                    <SvcLvl>
                        <Cd>SEPA</Cd>
                    </SvcLvl>
                    <LclInstrm>
                        <Cd>B2B</Cd>
                    </LclInstrm>
                    <CtgyPurp>
                        <Cd>SUPP</Cd>
                    </CtgyPurp>
                </PmtTpInf>
                <IntrBkSttlmAmt Ccy="EUR">1000.00</IntrBkSttlmAmt>
                <IntrBkSttlmDt>2024-12-10</IntrBkSttlmDt>
                <ChrgBr>SLEV</ChrgBr>
                <Dbtr>
                    <Nm>Debtor Name</Nm>
                    <PstlAdr>
                        <Ctry>DE</Ctry>
                        <AdrLine>Debtor Address Line 1</AdrLine>
                        <AdrLine>Debtor Address Line 2</AdrLine>
                    </PstlAdr>
                    <Id>
                        <OrgId>
                            <BICOrBEI>DEBTORBICXXX</BICOrBEI>
                        </OrgId>
                    </Id>
                </Dbtr>
                <DbtrAcct>
                    <Id>
                        <IBAN>DE89370400440532013000</IBAN>
                    </Id>
                </DbtrAcct>
                <DbtrAgt>
                    <FinInstnId>
                        <BICFI>DEBTAGNTBICXXX</BICFI>
                    </FinInstnId>
                </DbtrAgt>
                <CdtrAgt>
                    <FinInstnId>
                        <BICFI>CRDTAGNTBICXXX</BICFI>
                    </FinInstnId>
                </CdtrAgt>
                <Cdtr>
                    <Nm>Creditor Name</Nm>
                    <PstlAdr>
                        <Ctry>FR</Ctry>
                        <AdrLine>Creditor Address Line 1</AdrLine>
                        <AdrLine>Creditor Address Line 2</AdrLine>
                    </PstlAdr>
                    <Id>
                        <OrgId>
                            <BICOrBEI>CRDTORBICXXX</BICOrBEI>
                        </OrgId>
                    </Id>
                </Cdtr>
                <CdtrAcct>
                    <Id>
                        <IBAN>FR1420041010050500013M02606</IBAN>
                    </Id>
                </CdtrAcct>
                <RmtInf>
                    <Ustrd>Invoice Payment Ref: INV123456</Ustrd>
                    <Strd>
                        <CdtrRefInf>
                            <Tp>
                                <CdOrPrtry>
                                    <Cd>SCOR</Cd>
                                </CdOrPrtry>
                            </Tp>
                            <Ref>INV123456</Ref>
                        </CdtrRefInf>
                    </Strd>
                </RmtInf>
                <SplmtryData>
                    <PlcAndNm>AdditionalInfo</PlcAndNm>
                    <Envlp>
                        <Any xmlns="">
                            <CustomData>Custom XML Payload</CustomData>
                        </Any>
                    </Envlp>
                </SplmtryData>
            </CdtTrfTxInf>
        </FIToFICstmrCdtTrf>
    </Document>
</Envelope>

Key Elements in AppHdr:
1.	Fr (From):
•	Identifies the originating institution with BICFI.
2.	To (To):
•	Identifies the receiving institution with BICFI.
3.	BizMsgIdr:
•	Unique business message identifier for traceability.
4.	MsgDefIdr:
•	Specifies the type of message (e.g., pacs.008.001.09).
5.	BizSvc:
•	Defines the business service (e.g., SEPA for Single Euro Payments Area).
6.	CreDt:
•	Creation date and time of the message.
7.	CpyDplct:
•	Indicates if the message is an original or a copy/duplicate.
8.	PssblDplct:
•	Flags the possibility of a duplicate.

This header is essential for routing and processing the message in financial networks like SWIFT. Let me know if you need further customizations!