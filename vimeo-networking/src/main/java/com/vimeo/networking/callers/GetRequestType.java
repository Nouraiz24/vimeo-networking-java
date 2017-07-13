/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2017 Vimeo
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.vimeo.networking.callers;

import com.vimeo.networking.VimeoClient;
import com.vimeo.networking.VimeoService;
import com.vimeo.networking.callbacks.VimeoCallback;
import com.vimeo.networking.model.CategoryList;
import com.vimeo.networking.model.ChannelList;
import com.vimeo.networking.model.CommentList;
import com.vimeo.networking.model.FeedList;
import com.vimeo.networking.model.RecommendationList;
import com.vimeo.networking.model.UserList;
import com.vimeo.networking.model.VideoList;
import com.vimeo.networking.model.cinema.ProgramContentItemList;
import com.vimeo.networking.model.notifications.NotificationList;
import com.vimeo.networking.model.tvod.SeasonList;
import com.vimeo.networking.model.tvod.TvodList;

import org.jetbrains.annotations.NotNull;

import java.util.Map;

import okhttp3.CacheControl;
import retrofit2.Call;

/**
 * This is a collection of classes that should be used for get requests to
 * {@link VimeoClient#getContent(String, CacheControl, VimeoCallback, String, Map, String, Caller)} or
 * {@link VimeoClient#getContentSync(String, CacheControl, String, Map, String, Caller)}
 * Created by rigbergh on 7/9/17.
 */
public final class GetRequestType {


    public interface Caller<DataType_T> {

        @NotNull
        retrofit2.Call<DataType_T> call(@NotNull String authHeader,
                                        @NotNull String uri,
                                        @NotNull Map<String, String> queryMap,
                                        @NotNull String cacheHeader,
                                        VimeoService vimeoService);
    }


    public static final Caller<CategoryList> CATEGORY_LIST =
            new Caller<CategoryList>() {

                @NotNull
                @Override
                public Call<CategoryList> call(@NotNull String authHeader,
                                               @NotNull String uri,
                                               @NotNull Map<String, String> queryMap,
                                               @NotNull String cacheHeader,
                                               VimeoService vimeoService) {
                    return vimeoService.getCategoryList(authHeader, uri, queryMap, cacheHeader);
                }
            };

    public static final Caller<ChannelList> CHANNEL_LIST =
            new Caller<ChannelList>() {

                @NotNull
                @Override
                public Call<ChannelList> call(@NotNull String authHeader,
                                              @NotNull String uri,
                                              @NotNull Map<String, String> queryMap,
                                              @NotNull String cacheHeader,
                                              VimeoService vimeoService) {
                    return vimeoService.getChannelList(authHeader, uri, queryMap, cacheHeader);
                }
            };

    public static final Caller<CommentList> COMMENT_LIST =
            new Caller<CommentList>() {

                @NotNull
                @Override
                public Call<CommentList> call(@NotNull String authHeader,
                                              @NotNull String uri,
                                              @NotNull Map<String, String> queryMap,
                                              @NotNull String cacheHeader,
                                              VimeoService vimeoService) {
                    return vimeoService.getCommentList(authHeader, uri, queryMap, cacheHeader);
                }
            };

    public static final Caller<FeedList> FEED_LIST =
            new Caller<FeedList>() {

                @NotNull
                @Override
                public Call<FeedList> call(@NotNull String authHeader,
                                           @NotNull String uri,
                                           @NotNull Map<String, String> queryMap,
                                           @NotNull String cacheHeader,
                                           VimeoService vimeoService) {
                    return vimeoService.getFeedList(authHeader, uri, queryMap, cacheHeader);
                }
            };

    public static final Caller<NotificationList> NOTIFICATION_LIST =
            new Caller<NotificationList>() {

                @NotNull
                @Override
                public Call<NotificationList> call(
                        @NotNull String authHeader,
                        @NotNull String uri,
                        @NotNull Map<String, String> queryMap,
                        @NotNull String cacheHeader,
                        VimeoService vimeoService) {
                    return vimeoService.getNotificationList(authHeader, uri, queryMap, cacheHeader);
                }
            };

    public static final Caller<ProgramContentItemList> PROGRAM_CONTENT_ITEM_LIST =
            new Caller<ProgramContentItemList>() {

                @NotNull
                @Override
                public Call<ProgramContentItemList> call(
                        @NotNull String authHeader,
                        @NotNull String uri,
                        @NotNull Map<String, String> queryMap,
                        @NotNull String cacheHeader,
                        VimeoService vimeoService) {
                    return vimeoService.getProgramContentItemList(authHeader, uri, queryMap, cacheHeader);
                }
            };

    public static final Caller<RecommendationList> RECOMMENDATION_LIST =
            new Caller<RecommendationList>() {

                @NotNull
                @Override
                public Call<RecommendationList> call(@NotNull String authHeader,
                                                     @NotNull String uri,
                                                     @NotNull Map<String, String> queryMap,
                                                     @NotNull String cacheHeader,
                                                     VimeoService vimeoService) {
                    return vimeoService.getRecommendationList(authHeader, uri, queryMap, cacheHeader);
                }
            };

    public static final Caller<SeasonList> SEASON_LIST =
            new Caller<SeasonList>() {

                @NotNull
                @Override
                public Call<SeasonList> call(@NotNull String authHeader,
                                             @NotNull String uri,
                                             @NotNull Map<String, String> queryMap,
                                             @NotNull String cacheHeader,
                                             VimeoService vimeoService) {
                    return vimeoService.getSeasonList(authHeader, uri, queryMap, cacheHeader);
                }
            };

    public static final Caller<TvodList> TVOD_LIST =
            new Caller<TvodList>() {

                @NotNull
                @Override
                public Call<TvodList> call(@NotNull String authHeader,
                                           @NotNull String uri,
                                           @NotNull Map<String, String> queryMap,
                                           @NotNull String cacheHeader,
                                           VimeoService vimeoService) {
                    return vimeoService.getTvodList(authHeader, uri, queryMap, cacheHeader);
                }
            };

    public static final Caller<UserList> USER_LIST =
            new Caller<UserList>() {

                @NotNull
                @Override
                public Call<UserList> call(@NotNull String authHeader,
                                           @NotNull String uri,
                                           @NotNull Map<String, String> queryMap,
                                           @NotNull String cacheHeader,
                                           VimeoService vimeoService) {
                    return vimeoService.getUserList(authHeader, uri, queryMap, cacheHeader);
                }
            };

    public static final Caller<VideoList> VIDEO_LIST =
            new Caller<VideoList>() {

                @NotNull
                @Override
                public Call<VideoList> call(@NotNull String authHeader,
                                            @NotNull String uri,
                                            @NotNull Map<String, String> queryMap,
                                            @NotNull String cacheHeader,
                                            VimeoService vimeoService) {
                    return vimeoService.getVideoList(authHeader, uri, queryMap, cacheHeader);
                }
            };

    private GetRequestType() {

    }

}
