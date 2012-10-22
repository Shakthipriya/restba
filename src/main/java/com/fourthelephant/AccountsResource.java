package com.fourthelephant;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * User: vbobrov
 * Date: 1/12/12
 * Time: 3:54 PM
 */

@Path("/accounts")
public class AccountsResource {

    @GET
    @Produces( { MediaType.TEXT_HTML })
    public String getHTML() {
        StringBuilder sb = new StringBuilder("<html><body><table border=\"1\"><tr><th>acnominor</th><th>entity id</th></tr>");
        sb.append("<tr>");
        sb.append("<td>");
        sb.append("aaaaaaaaaaaaaaaaaaaaaaa");
        sb.append("</td>");
        sb.append("<td>");
        sb.append("bbbbbbbbbbbbbbbbbbbbbb");
        sb.append("</td>");
        sb.append("</tr>");

        sb.append("</table></body><html>");
        return sb.toString();
    }



/*
    @GET
    @Produces( { MediaType.TEXT_XML, MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public AccountID[] getXML() {
        return Accounts.getMinorAccounts();
    }
*/

}
