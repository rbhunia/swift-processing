package com.example.mx.pacs008.parser;

import com.example.mx.exception.MxMessageParsingException;
import com.example.mx.prser.AbstractMxParser;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.AppHdr;
import com.prowidesoftware.swift.model.mx.MxPacs00800109;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MXPacs008Parser extends AbstractMxParser {

    private static final String MESSAGE_TYPE = "PACS.008.001.09";
    private static final String MESSAGE_VERSION = "v1.0.9";
    private static final String MESSAGE_NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.09";
    private static final String MESSAGE_BODY = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<Envelope xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\">\n" +
            "    <!-- Application Header -->\n" +
            "    <AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\">\n" +
            "        <Fr>\n" +
            "            <FIId>\n" +
            "                <FinInstnId>\n" +
            "                    <BICFI>INSTBICXXX</BICFI>\n" +
            "                </FinInstnId>\n" +
            "            </FIId>\n" +
            "        </Fr>\n" +
            "        <To>\n" +
            "            <FIId>\n" +
            "                <FinInstnId>\n" +
            "                    <BICFI>RECVBICXXX</BICFI>\n" +
            "                </FinInstnId>\n" +
            "            </FIId>\n" +
            "        </To>\n" +
            "        <BizMsgIdr>BMID1234567890</BizMsgIdr>\n" +
            "        <MsgDefIdr>pacs.008.001.09</MsgDefIdr>\n" +
            "        <BizSvc>SEPA</BizSvc>\n" +
            "        <CreDt>2024-12-09T12:30:00</CreDt>\n" +
            "        <CpyDplct>CODU</CpyDplct>\n" +
            "        <PssblDplct>true</PssblDplct>\n" +
            "    </AppHdr>\n" +
            "\n" +
            "    <!-- Message Body -->\n" +
            "    <Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.09\">\n" +
            "        <FIToFICstmrCdtTrf>\n" +
            "            <GrpHdr>\n" +
            "                <MsgId>MSGID1234567890</MsgId>\n" +
            "                <CreDtTm>2024-12-09T12:30:00</CreDtTm>\n" +
            "                <NbOfTxs>1</NbOfTxs>\n" +
            "                <SttlmInf>\n" +
            "                    <SttlmMtd>CLRG</SttlmMtd>\n" +
            "                    <ClrSys>\n" +
            "                        <ClrSysId>TARGET2</ClrSysId>\n" +
            "                    </ClrSys>\n" +
            "                </SttlmInf>\n" +
            "                <InstgAgt>\n" +
            "                    <FinInstnId>\n" +
            "                        <BICFI>INSTBICXXX</BICFI>\n" +
            "                    </FinInstnId>\n" +
            "                </InstgAgt>\n" +
            "                <InstdAgt>\n" +
            "                    <FinInstnId>\n" +
            "                        <BICFI>RECVBICXXX</BICFI>\n" +
            "                    </FinInstnId>\n" +
            "                </InstdAgt>\n" +
            "            </GrpHdr>\n" +
            "            <CdtTrfTxInf>\n" +
            "                <PmtId>\n" +
            "                    <InstrId>INSTR1234567890</InstrId>\n" +
            "                    <EndToEndId>E2E1234567890</EndToEndId>\n" +
            "                    <TxId>TXID1234567890</TxId>\n" +
            "                </PmtId>\n" +
            "                <PmtTpInf>\n" +
            "                    <InstrPrty>NORM</InstrPrty>\n" +
            "                    <SvcLvl>\n" +
            "                        <Cd>SEPA</Cd>\n" +
            "                    </SvcLvl>\n" +
            "                    <LclInstrm>\n" +
            "                        <Cd>B2B</Cd>\n" +
            "                    </LclInstrm>\n" +
            "                    <CtgyPurp>\n" +
            "                        <Cd>SUPP</Cd>\n" +
            "                    </CtgyPurp>\n" +
            "                </PmtTpInf>\n" +
            "                <IntrBkSttlmAmt Ccy=\"EUR\">1000.00</IntrBkSttlmAmt>\n" +
            "                <IntrBkSttlmDt>2024-12-10</IntrBkSttlmDt>\n" +
            "                <ChrgBr>SLEV</ChrgBr>\n" +
            "                <Dbtr>\n" +
            "                    <Nm>Debtor Name</Nm>\n" +
            "                    <PstlAdr>\n" +
            "                        <Ctry>DE</Ctry>\n" +
            "                        <AdrLine>Debtor Address Line 1</AdrLine>\n" +
            "                        <AdrLine>Debtor Address Line 2</AdrLine>\n" +
            "                    </PstlAdr>\n" +
            "                    <Id>\n" +
            "                        <OrgId>\n" +
            "                            <BICOrBEI>DEBTORBICXXX</BICOrBEI>\n" +
            "                        </OrgId>\n" +
            "                    </Id>\n" +
            "                </Dbtr>\n" +
            "                <DbtrAcct>\n" +
            "                    <Id>\n" +
            "                        <IBAN>DE89370400440532013000</IBAN>\n" +
            "                    </Id>\n" +
            "                </DbtrAcct>\n" +
            "                <DbtrAgt>\n" +
            "                    <FinInstnId>\n" +
            "                        <BICFI>DEBTAGNTBICXXX</BICFI>\n" +
            "                    </FinInstnId>\n" +
            "                </DbtrAgt>\n" +
            "                <CdtrAgt>\n" +
            "                    <FinInstnId>\n" +
            "                        <BICFI>CRDTAGNTBICXXX</BICFI>\n" +
            "                    </FinInstnId>\n" +
            "                </CdtrAgt>\n" +
            "                <Cdtr>\n" +
            "                    <Nm>Creditor Name</Nm>\n" +
            "                    <PstlAdr>\n" +
            "                        <Ctry>FR</Ctry>\n" +
            "                        <AdrLine>Creditor Address Line 1</AdrLine>\n" +
            "                        <AdrLine>Creditor Address Line 2</AdrLine>\n" +
            "                    </PstlAdr>\n" +
            "                    <Id>\n" +
            "                        <OrgId>\n" +
            "                            <BICOrBEI>CRDTORBICXXX</BICOrBEI>\n" +
            "                        </OrgId>\n" +
            "                    </Id>\n" +
            "                </Cdtr>\n" +
            "                <CdtrAcct>\n" +
            "                    <Id>\n" +
            "                        <IBAN>FR1420041010050500013M02606</IBAN>\n" +
            "                    </Id>\n" +
            "                </CdtrAcct>\n" +
            "                <RmtInf>\n" +
            "                    <Ustrd>Invoice Payment Ref: INV123456</Ustrd>\n" +
            "                    <Strd>\n" +
            "                        <CdtrRefInf>\n" +
            "                            <Tp>\n" +
            "                                <CdOrPrtry>\n" +
            "                                    <Cd>SCOR</Cd>\n" +
            "                                </CdOrPrtry>\n" +
            "                            </Tp>\n" +
            "                            <Ref>INV123456</Ref>\n" +
            "                        </CdtrRefInf>\n" +
            "                    </Strd>\n" +
            "                </RmtInf>\n" +
            "                <SplmtryData>\n" +
            "                    <PlcAndNm>AdditionalInfo</PlcAndNm>\n" +
            "                    <Envlp>\n" +
            "                        <Any xmlns=\"\">\n" +
            "                            <CustomData>Custom XML Payload</CustomData>\n" +
            "                        </Any>\n" +
            "                    </Envlp>\n" +
            "                </SplmtryData>\n" +
            "            </CdtTrfTxInf>\n" +
            "        </FIToFICstmrCdtTrf>\n" +
            "    </Document>\n" +
            "</Envelope>";

    @Override
    public String parse(String message) throws MxMessageParsingException {
        AbstractMX abstractMX = AbstractMX.parse(message);
        if (abstractMX instanceof MxPacs00800109) {
            MxPacs00800109 pacs008 = (MxPacs00800109) abstractMX;
            AppHdr appHdr = pacs008.getAppHdr();
            String senderBic = appHdr.from();
            String receiverBic = appHdr.to();
            // Access fields in the message
            //System.out.println("Business Message Identifier: " + appHdr);
        }
        return null;

    }

    public static void main(String[] args) {
        MXPacs008Parser parser = new MXPacs008Parser();
        try {
            parser.parse(MESSAGE_BODY);
        } catch (MxMessageParsingException e) {
            e.printStackTrace();
        }
    }
}
