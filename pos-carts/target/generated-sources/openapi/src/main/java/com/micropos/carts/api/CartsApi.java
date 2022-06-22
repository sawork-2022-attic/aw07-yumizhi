/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.micropos.carts.api;

import com.micropos.carts.dto.CartDto;
import com.micropos.carts.dto.InlineObjectDto;
import com.micropos.carts.dto.ItemDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-15T17:10:04.315297+08:00[Asia/Shanghai]")
@Validated
@Tag(name = "carts", description = "the carts API")
public interface CartsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /carts/cancel : Delete all items
     *
     * @return Deleted (status code 204)
     *         or error (status code 404)
     */
    @Operation(
        operationId = "cartsCancelDelete",
        summary = "Delete all items",
        responses = {
            @ApiResponse(responseCode = "204", description = "Deleted", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  CartDto.class))),
            @ApiResponse(responseCode = "404", description = "error")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/carts/cancel",
        produces = { "application/json" }
    )
    default ResponseEntity<CartDto> cartsCancelDelete(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"items\" : [ { \"product\" : { \"image\" : \"image\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\" }, \"quantity\" : 0 }, { \"product\" : { \"image\" : \"image\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\" }, \"quantity\" : 0 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /carts/checkout : checkout
     *
     * @return Success (status code 200)
     *         or error (status code 404)
     */
    @Operation(
        operationId = "cartsCheckoutGet",
        summary = "checkout",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  CartDto.class))),
            @ApiResponse(responseCode = "404", description = "error")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/carts/checkout",
        produces = { "application/json" }
    )
    default ResponseEntity<CartDto> cartsCheckoutGet(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"items\" : [ { \"product\" : { \"image\" : \"image\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\" }, \"quantity\" : 0 }, { \"product\" : { \"image\" : \"image\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\" }, \"quantity\" : 0 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /carts : Adds a new item
     *
     * @param inlineObjectDto  (optional)
     * @return OK (status code 200)
     *         or error (status code 404)
     */
    @Operation(
        operationId = "cartsPost",
        summary = "Adds a new item",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  CartDto.class))),
            @ApiResponse(responseCode = "404", description = "error")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/carts",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<CartDto> cartsPost(
        @Parameter(name = "InlineObjectDto", description = "", schema = @Schema(description = "")) @Valid @RequestBody(required = false) InlineObjectDto inlineObjectDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"items\" : [ { \"product\" : { \"image\" : \"image\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\" }, \"quantity\" : 0 }, { \"product\" : { \"image\" : \"image\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\" }, \"quantity\" : 0 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /carts/{itemId} : Delete item by id
     *
     * @param itemId The id of the item to retrieve (required)
     * @return Deleted (status code 204)
     *         or id not found (status code 404)
     */
    @Operation(
        operationId = "deleteItemById",
        summary = "Delete item by id",
        tags = { "item" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Deleted", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  CartDto.class))),
            @ApiResponse(responseCode = "404", description = "id not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/carts/{itemId}",
        produces = { "application/json" }
    )
    default ResponseEntity<CartDto> deleteItemById(
        @Parameter(name = "itemId", description = "The id of the item to retrieve", required = true, schema = @Schema(description = "")) @PathVariable("itemId") String itemId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"items\" : [ { \"product\" : { \"image\" : \"image\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\" }, \"quantity\" : 0 }, { \"product\" : { \"image\" : \"image\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\" }, \"quantity\" : 0 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /carts : List all items
     *
     * @return A paged array of items (status code 200)
     *         or unexpected error (status code 200)
     */
    @Operation(
        operationId = "listItems",
        summary = "List all items",
        tags = { "items" },
        responses = {
            @ApiResponse(responseCode = "200", description = "A paged array of items", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  CartDto.class))),
            @ApiResponse(responseCode = "200", description = "unexpected error")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/carts",
        produces = { "application/json" }
    )
    default ResponseEntity<CartDto> listItems(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"items\" : [ { \"product\" : { \"image\" : \"image\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\" }, \"quantity\" : 0 }, { \"product\" : { \"image\" : \"image\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\" }, \"quantity\" : 0 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /carts/{itemId} : Info for a specific item
     *
     * @param itemId The id of the item to retrieve (required)
     * @return Expected response to a valid request (status code 200)
     *         or unexpected error (status code 200)
     */
    @Operation(
        operationId = "showItemById",
        summary = "Info for a specific item",
        tags = { "item" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Expected response to a valid request", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  ItemDto.class))),
            @ApiResponse(responseCode = "200", description = "unexpected error")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/carts/{itemId}",
        produces = { "application/json" }
    )
    default ResponseEntity<ItemDto> showItemById(
        @Parameter(name = "itemId", description = "The id of the item to retrieve", required = true, schema = @Schema(description = "")) @PathVariable("itemId") String itemId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"product\" : { \"image\" : \"image\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\" }, \"quantity\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}